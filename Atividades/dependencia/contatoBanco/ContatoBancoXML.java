package Atividades.dependencia.contatoBanco;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import Atividades.dependencia.Contato;

public class ContatoBancoXML implements ContatoBanco {

    private static final String XML_FILE_PATH = "src/Atividades/dependencia/db/agenda.xml";

    public Contato getContatoId(int id) {
        List<Contato> contatos = getTodosContatos();
        for (Contato contato : contatos) {
            // Assuming IDs are generated based on the index of the contact in the list
            if (contatos.indexOf(contato) == id) {
                return contato;
            }
        }
        return null;
    }

    public Contato getContatoEmail(String email) {
        List<Contato> contatos = getTodosContatos();
        for (Contato contato : contatos) {
            if (contato.getEmail().equals(email)) {
                return contato;
            }
        }
        return null;
    }

    public ArrayList<Contato> getTodosContatos() {
        ArrayList<Contato> contatos = new ArrayList<>();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File(XML_FILE_PATH));
            doc.getDocumentElement().normalize();

            NodeList contactList = doc.getElementsByTagName("contact");
            for (int temp = 0; temp < contactList.getLength(); temp++) {
                Node contactNode = contactList.item(temp);
                if (contactNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element contactElement = (Element) contactNode;
                    String name = contactElement.getAttribute("name");
                    String birthDate = contactElement.getAttribute("birthDate");
                    String phone = contactElement.getAttribute("phone");
                    String email = contactElement.getAttribute("email");
                    contatos.add(new Contato(name, birthDate, phone, email));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contatos;
    }

    public boolean inserir(Contato contato) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new File(XML_FILE_PATH));

            Element newContact = doc.createElement("contact");
            newContact.setAttribute("name", contato.getName());
            newContact.setAttribute("birthDate", contato.getBirthDate());
            newContact.setAttribute("phone", contato.getPhone());
            newContact.setAttribute("email", contato.getEmail());

            Node contacts = doc.getElementsByTagName("contacts").item(0);
            contacts.appendChild(newContact);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(XML_FILE_PATH));
            transformer.transform(source, result);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterar(Contato contato) {
        ArrayList<Contato> contatos = getTodosContatos();
        int indexToUpdate = -1;
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getEmail().equals(contato.getEmail())) {
                indexToUpdate = i;
                break;
            }
        }

        if (indexToUpdate != -1) {
            contatos.set(indexToUpdate, contato);
            return saveContatosToXML(contatos);
        }

        return false;
    }

    public boolean excluir(int id) {
        ArrayList<Contato> contatos = getTodosContatos();
        if (id >= 0 && id < contatos.size()) {
            contatos.remove(id);
            return saveContatosToXML(contatos);
        }
        return false;
    }

    private boolean saveContatosToXML(List<Contato> contatos) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            Element contacts = doc.createElement("contacts");
            doc.appendChild(contacts);

            for (Contato contato : contatos) {
                Element contact = doc.createElement("contact");
                contact.setAttribute("name", contato.getName());
                contact.setAttribute("birthDate", contato.getBirthDate());
                contact.setAttribute("phone", contato.getPhone());
                contact.setAttribute("email", contato.getEmail());
                contacts.appendChild(contact);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(XML_FILE_PATH));
            transformer.transform(source, result);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
