public class Calculator{

    public int factorial (int num){
        if(num < 0){
            throw new IllegalArgumentException(" Invalid. Negative Number");
        }
        return num;
    }
    public int binomialCoefficient(int subset, int setsize){
        if( subset < setsize && subset < 0 || setsize < 0){
            throw new IllegalArgumentException(" Invalid");
        }
        return  binomialCoefficient(subset, setsize);
    }
}