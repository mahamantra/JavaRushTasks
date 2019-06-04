import java.io.*;

public class Logon implements Externalizable {
    private String login;
    private String password;

    public Logon() {
    }

    public Logon(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(login);
        out.writeObject(password);
    }


    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        login = (String) in.readObject();
        password = (String) in.readObject();

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Logon igor = new Logon("IgorIvanovich", "Khoziain");
        Logon renat = new Logon("Renat", "2500RUB");


        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Externals.out"));
        out.writeObject(igor);
        out.writeObject(renat);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Externals.out"));
        igor = (Logon) in.readObject();
        renat = (Logon) in.readObject();

        System.out.println(igor.login+igor.password);
        System.out.println(renat.login+renat.password);


    }
}
