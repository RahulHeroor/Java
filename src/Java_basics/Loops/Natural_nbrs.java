package Loops;
class Sirial_nbrs{
    public Sirial_nbrs(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

    }
}
public class Natural_nbrs {
    public static void main(String[] args) {
        Sirial_nbrs obj=new Sirial_nbrs(5);

    }
}
