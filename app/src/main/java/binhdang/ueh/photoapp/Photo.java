package binhdang.ueh.photoapp;

public class Photo {
    private int id;
    private String sourcePhoto;
    private String captionPhoto;
    private String descriptionPhoto;

    public Photo(int id, String sourcePhoto, String captionPhoto, String descriptionPhoto){
        this.id = id;
        this.sourcePhoto = sourcePhoto;
        this.captionPhoto = captionPhoto;
        this.descriptionPhoto = descriptionPhoto;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSourcePhoto() { return sourcePhoto; }
    public void setSourcePhoto(String sourcePhoto) { this.sourcePhoto = sourcePhoto; }

    public String getCaptionPhoto() { return captionPhoto; }
    public void setCaptionPhoto(String captionPhoto) { this.captionPhoto = captionPhoto; }

    public String getDescriptionPhoto() { return descriptionPhoto; }
    public void setDescriptionPhoto(String descriptionPhoto) { this.descriptionPhoto = descriptionPhoto;}
}
