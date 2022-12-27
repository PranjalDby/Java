interface UserInfoProvider{
    int id = 1;
    public void printInfo();
        
}
class BasicInfoProvider implements UserInfoProvider{
    @Override
    public void printInfo() {
        System.out.println("Pranjal");
    }
}
public class Main{
   
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            System.out.println(i);
            for(int j = 2;j<11;j++){
                System.out.println(j);
            }
        }
    }
}
