package gelecegiyazanlar.com.gyk301;

import java.util.ArrayList;

public class Users {
    String name;
    String telephone;
    int Image;
    ArrayList<String> about;

    public Users(String name, String telephone, int image, ArrayList<String> about) {
        this.name = name;
        this.telephone = telephone;
        Image = image;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public ArrayList<String> getAbout() {
        return about;
    }

    public void setAbout(ArrayList<String> about) {
        this.about = about;
    }
}
