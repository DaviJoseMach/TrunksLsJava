package Ex.Projects.DbKey.Domain;

public class domainDb {
    private String keyConnect;
    private String nameDb;

    public domainDb(String keyConnect) {
        this.keyConnect = keyConnect;
    }

    public void setNameDb(String nameDb){
        this.nameDb = nameDb;
    }

    public String getNameDb() {
        return nameDb;
    }

    public void exDbInfos(){
        System.out.println("Sua key definida é" + this.keyConnect);
    }
}
