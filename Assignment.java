package Assignment.Codes;
// WAP to PRint Pattern program for INEURON
public class Assignment {
    public static void main(String[] args) {

        Assignment assn = new Assignment();
        assn.Question1(7);

        System.out.println();
        
        assn.Question2(7);
        
        System.out.println();

        assn.Question3(14);
        
        System.out.println();

        assn.Question4(14);

        System.out.println();
        
        assn.Question5(14);
        
        
    }
    public void Question1(int n){
        for(int i =0 ; i<n;i++){
            for(int j = 0 ; j<n ; j++)
            {
                if(i == 0 || i==n-1 || j ==(n-1)/2)
                {   
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j = 0 ; j<n; j++)
            {
                if(j == 0 || j == n-1 ||(i == j) )
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j = 0 ; j<n ; j++)
            {
                if(j == 0 || i == 0 || i == n-1 || i == (n-1)/2)
                {   
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j = 0 ; j<n; j++)
            {
                if((j == 0 && i!=n-1)|| (j == n-1 && i!= n-1)||(i == n-1 && j != 0 && j != n-1))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j = 0 ; j<n; j++)
            {
                if(j == 0 || (i == 0 && j!=n-1) ||( i == (n-1)/2 && j != n-1) || (j==n-1 && i!=0 && i<(n-1)/2) || (i == j && i>(n-1)/2 && j>(n-1)/2))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j = 0 ; j<n; j++)
            {
                if((j == 0 && i!= 0 && i != n-1)||(j == n-1 && i!= 0 && i != n-1) || (i == 0 && j!=0 && j!= n-1) || (i ==n-1 && j != 0 && j!= n-1))
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j = 0 ; j<n; j++)
            {
                if(j == 0 || j == n-1 ||(i == j) )
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();


        }
    }
    public void Question2(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 0; j<n;j++){
                System.out.print(i);
            }
            System.out.println();

        }
    }
    public void Question3(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n ;j++){
                if(i==0 || i ==n-1 || j == 0|| j== n-1||j-i >= (n-1)/2 || i+j <=(n-1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
    public void Question4(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n ;j++){
                if(i+j >= (n-1)+(n-1)/2 || i-j >= (n-1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }

    }
    public void Question5(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n ;j++){
                if(i == 0||i==n-1|| i-j >= (n-1)/2||i+j <=(n-1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }System.out.println();
        }

    }
}
