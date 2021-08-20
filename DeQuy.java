public class DeQuy {
    public static void main(String args[]) {
        
        System.out.println(factorial(4));
        
        System.out.println(sum(100));
        
        System.out.println(fibonacci(6));
          
        }
        // 5! = 5*4*3*2*1 
        public static int factorial(int n){
            if (n == 1){
                return 1;   // base case
            }
            return n*factorial(n-1);    // recursive case
        }
        
        // tinh tong = s + (s-1) + (s-2) + (s-3) + ...
        public static int sum(int s){
            if(s == 1){
                return 1;   // base case
            }
            return s + sum(s-1);    // recursive case
        }
        
        // tinh fibonacci(n)=fibonacci(n-1)+fibonacci(n-2)
        public static int fibonacci(int f){
            if(f==1){   
                return 1;   // base case
            } else if(f==2){
                return 1;   // base case
            } else {
                return fibonacci(f-1) + fibonacci(f-2); // recursive case
            }
            
        }
}
