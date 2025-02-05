package JavaDojo.st.core.kenum.test;

import JavaDojo.st.core.kenum.domain.Client;
import JavaDojo.st.core.kenum.domain.TipoClient;

public class TestClient {
    public static void main(String[] args) {
        Client client = new Client("Levi", TipoClient.PESSOA_FISICA);
        Client client2 = new Client("Levi", TipoClient.PESSOA_JURIDICA);


        System.out.println(client);
        System.out.println(client2);

    }
}
