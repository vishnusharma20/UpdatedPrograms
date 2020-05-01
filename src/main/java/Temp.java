import java.util.Set;
import java.util.TreeSet;

enum Name
{

    A, S, B ,J
}

class H{


    public static void main(String[] args) {

        Set<Name> s = new TreeSet<Name>();
        s.add(Name.A);
        s.add(Name.S);
        s.add(Name.B);
        s.add(Name.S);

        for(Name d: s){

            System.out.println(d);
        }

    }
}