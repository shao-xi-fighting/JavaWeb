package main.DAO;

public class testLogin {
    public static void main(String[] args) {
        LoginQuery loginQuery = new LoginQuery();
        boolean fal=loginQuery.serachUser("layman","shaoxi");
        System.out.println(fal);
    }
}
