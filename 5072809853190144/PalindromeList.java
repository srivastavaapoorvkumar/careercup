import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.lang.NumberFormatException;

public class PalindromeList {
    public static void main (String[] args) {
        System.out.println("https://www.careercup.com/question?id=5072809853190144");
        System.out.println();
        System.out.println();
        if(args.length == 0){
            System.out.println("Please specify list");
        } else {
            List<Integer> list = new LinkedList<>();
            for(int argv = 0; argv < args.length; argv ++){
                String arg = args[argv];
                try{
                    list.add(Integer.parseInt(arg));
                } catch(NumberFormatException e){
                    System.err.println(arg + " is not an Integer");
                    e.printStackTrace();
                    return;
                }
            }
            PalindromeList pl = new PalindromeList(list);
            if(pl.check()){
                System.out.println(" WOAH..!! A Palindrome list");
            } else {
                System.out.println(" TRY AGAIN ..!! Not A Palindrome list");
            }
        }
    }

    List<Integer> list;
    public PalindromeList(List<Integer> list){
        this.list = list;
    }

    public boolean check(){
        Iterator<Integer> itMid = getMidIterator();
        Iterator<Integer> it = list.iterator();
        while(itMid.hasNext()){
            int a = itMid.next();
            int b = it.next();
            System.out.println("Going to compare "+a+" "+b);
            if(a!=b){
                return false;
            }
        }
        return true;
    }

    public Iterator<Integer> getMidIterator(){
        Iterator<Integer> itSingle = list.iterator();
        Iterator<Integer> itDouble = list.iterator();
        if(list.size() == 0){
            return itSingle;
        } else {
            itSingle.next();
            itDouble.next();
        }
        int i,j,k;
        while(itDouble.hasNext()){
            i = itDouble.next();
            if(itDouble.hasNext()){
                j = itDouble.next();
                k = itSingle.next();
                System.out.println("i="+i+" j="+j+" k="+k);
            }
        }
        return itSingle;
    }
}
