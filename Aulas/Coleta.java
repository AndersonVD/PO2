package Aulas;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Coleta {
    public static void main(String[] args) {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.freepik.com/xhr/download-url/19894677"))
                .header("cookie",
                        "_ga_4P5NH5X34K=GS1.1.1689647958.2.0.1689647958.60.0.0; GR_REFRESH=AMf-vBwjgUNie2U8A0SSA2Y4m3iZGL-0DC3b34h-ckGS5oGtogq6KSalts2EuEwiXvKWJgrsQxSaZm7McdbnRgzw72dcrNZv3DS-c5JD6NfYavoG_FdumRyjf7kxfbSk4xeSnHUTTZHqg6xmG2qpfYx8rAKvGIwUjbK50vJ3ZYAE5FFyPN5D_By8ZWsRhh31Vg9dg8J2-EI8; GR_TOKEN=eyJhbGciOiJSUzI1NiIsImtpZCI6IjYyM2YzNmM4MTZlZTNkZWQ2YzU0NTkyZTM4ZGFlZjcyZjE1YTBmMTMiLCJ0eXAiOiJKV1QifQ.eyJuYW1lIjoiQW5kZXJzb24gVmlhbmEiLCJwaWN0dXJlIjoiaHR0cHM6Ly9saDMuZ29vZ2xldXNlcmNvbnRlbnQuY29tL2EvQUFjSFR0Y0VCTTdWdmVzdGlJbllUbjB5ME9BOThHUTBWYk1MMGdMZHh0MlFJaVpqa2ljWj1zOTYtYyIsImFjY291bnRzX3VzZXJfaWQiOjExMDI2OTExNywic2NvcGVzIjoiZnJlZXBpay9pbWFnZXMgZnJlZXBpay92aWRlb3MgZmxhdGljb24vcG5nIiwiaXNzIjoiaHR0cHM6Ly9zZWN1cmV0b2tlbi5nb29nbGUuY29tL2ZjLXByb2ZpbGUtcHJvLXJldjEiLCJhdWQiOiJmYy1wcm9maWxlLXByby1yZXYxIiwiYXV0aF90aW1lIjoxNjg5Nzc5NjE3LCJ1c2VyX2lkIjoiMEM5NmZ3YUk0d1FEdk1LUUtvQXZzdG1zZHl3MiIsInN1YiI6IjBDOTZmd2FJNHdRRHZNS1FLb0F2c3Rtc2R5dzIiLCJpYXQiOjE2OTA3MzI1NTgsImV4cCI6MTY5MDczNjE1OCwiZW1haWwiOiJhbmRlcnNvbi52aWFuYWRpYXMudmlhbmFkaWFzQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJmaXJlYmFzZSI6eyJpZGVudGl0aWVzIjp7Imdvb2dsZS5jb20iOlsiMTA0NTE2Mzg4NTk1OTAyODIzMTQxIl0sImVtYWlsIjpbImFuZGVyc29uLnZpYW5hZGlhcy52aWFuYWRpYXNAZ21haWwuY29tIl19LCJzaWduX2luX3Byb3ZpZGVyIjoiY3VzdG9tIn19.XNtCPObNV_ZJIbSshYnU8XJGbCXg-MzGUSZQaAMl26TTjYLSbS4JofyaEoVA-A-1pPxYdktHLHI6R1DC0e52fwHPzj7J2SxQMIKvWy3HwJWoVvYRY2FU-Y-k-ztTVWQpPblhCVvDkU8mZ0gGX92juXUnVS1OtChzEDrwMEv6wK5qylckj9EKF6sMQrYIqtC1MBRZjrFJW2gx3HHEqsw026RR5-6qmVlMXwb3N8bl8S6Qa7VvtV75jGdyGFa4MgS9xtEo9JBxpsaBaNcDNC-kN_E9bmgiqyD3l1ZQWJuaTPV9Hkxkq5BYl3JqfsEB6eGfRVl2-lPkzDkWmUxXCFh9OQ;")
                .header("x-requested-with", "XMLHttpRequest")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e) {
            System.out.println("Erro ao enviar requisição");
        }

    }

}
