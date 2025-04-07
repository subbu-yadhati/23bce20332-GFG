public class happynum {
    public static int sumpow(int a){
        int sum=0;
        int temp=a;
        while(temp>0){
            int x=temp%10;
            int y=x*x;
            sum=sum+y;
            temp=temp/10;
        }
        return sum;
    }
    public static boolean check(int a){
        int b=sumpow(a);
        while (b>10){
            b=sumpow(b);
        }
        if(b==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a=2;
        System.out.println(check(a));
    }
}
