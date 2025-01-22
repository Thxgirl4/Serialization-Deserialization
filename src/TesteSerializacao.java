import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana", 22);

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pessoa.ser"))){
            out.writeObject(pessoa);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}