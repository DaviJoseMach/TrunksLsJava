package JavaDojo.st.tierone;

public class Switch {
    public static void main(String[] args) {
        int dia = 3;
        switch(dia){
            case 1:
                System.out.println("Domingo"); break;
            case 2:
                System.out.println("Seg"); break;
            case 3:
                System.out.println("Ter"); break;
            case 4:
                System.out.println("Outro dia"); break;
            default:
                System.out.println("Data inválida"); break;
        }
    }
}
