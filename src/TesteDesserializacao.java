import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("pessoa.ser"))){
            Pessoa pessoa = (Pessoa) in.readObject();
            System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
        }

    }
}
