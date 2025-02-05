package JavaDojo.st.core.kenum.test;

import JavaDojo.st.core.kenum.domain.Client;

public class TestClient {
    public static void main(String[] args) {
        Client client = new Client("Levi", "PESSOA_FISICA");
        Client client2 = new Client("Levi", "PESSOA_JURIDICA");
        Client client3 = new Client("Levi", "pesso ajurai");

        System.out.println(client);
        System.out.println(client2);
        System.out.println(client3);
    }
}
