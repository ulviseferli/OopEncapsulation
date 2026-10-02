public class User {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName != null){
            this.userName = userName.toLowerCase();
        }else{
            System.out.println("username kicik herfler olmalidir");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() >= 8){
            this.password = password;
        }else{
            System.out.println("sifre en azi 8 simvol olmalidir");
        }
    }

    public Boolean checkPassword(String password){
        return this.password.equals(password);
    }

    public void changePassword(String oldPassword, String newPassword){
        if(checkPassword(oldPassword)){
            if(newPassword.length() >= 8){
                this.password = newPassword;
                System.out.println("sifre ugurla guncellendi");
            }else{
                System.out.println("sifre en azi 8 simvol olmalidir");
            }
        }else{
            System.out.println("sifre yanlisdir");
        }
    }
}
