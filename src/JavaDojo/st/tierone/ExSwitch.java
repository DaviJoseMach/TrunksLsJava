package JavaDojo.st.tierone;

public class ExSwitch {
    public static void main(String[] args) {
        int dia = 4;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(
                        "Dia util"
                );
                break;
            default:
                System.out.println("Dia inválido");
                break;

        }
    }
}
