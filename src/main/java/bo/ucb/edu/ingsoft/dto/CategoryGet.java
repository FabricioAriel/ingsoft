package bo.ucb.edu.ingsoft.dto;

public class CategoryGet {
    private Integer tagId;
    private String category;

    public CategoryGet() {

    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CategoryGet{" +
                "tagId=" + tagId +
                ", category='" + category + '\'' +
                '}';
    }
}
