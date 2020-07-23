package jihanislam007.devsbox.cookingwithferdous.Adaptor.ModelClass;

public class CategoryList {

    String TitleName;
    String ImageURL;
    String Upokoron;
    String procedure;
    public int categoryItemid;

    public CategoryList() {
    }

    public CategoryList(String titleName, String imageURL, String upokoron, String procedure, int categoryItemid) {
        TitleName = titleName;
        ImageURL = imageURL;
        Upokoron = upokoron;
        this.procedure = procedure;
        this.categoryItemid = categoryItemid;
    }

    public String getTitleName() {
        return TitleName;
    }

    public void setTitleName(String titleName) {
        TitleName = titleName;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public String getUpokoron() {
        return Upokoron;
    }

    public void setUpokoron(String upokoron) {
        Upokoron = upokoron;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public int getCategoryItemid() {
        return categoryItemid;
    }

    public void setCategoryItemid(int categoryItemid) {
        this.categoryItemid = categoryItemid;
    }
}