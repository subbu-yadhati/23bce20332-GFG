import java.util.*;;
public class minsteps {
    public static int count(String s1,String s2){
        String x="";
        int count=s1.length();
        for(int i=0;i<s2.length();i++){
            String y=""+s2.charAt(i);
            if(s1.contains(y) && !x.contains(y)){
                count--;
                x=x+y;
            }
        }
        return (count+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int count=s1.length();
        System.out.println("mininum steps required : "+count(s1,s2));        
    }
}