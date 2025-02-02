package Ex.Projects.DbKey.TestConnect;

import Ex.Projects.DbKey.Domain.domainDb;

public class dbTeste {
    public static void main(String[] args) {
        domainDb db = new domainDb("123ih152i1hij");
        db.setNameDb("TesteDb");
        System.out.println(db.getNameDb());
    }
}
