package sg.nus.iss.final_project.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "promotions")
public class Promotion {
    @Id
    private String id;
    private String merchant;
    private String description;
    private String expiry; // Changed from LocalDateTime to match the data structure
    private String imageUrl; // Changed to match property name in the data
    private String location;
    private String code;
    private String conditions;
    private String category; // Added category field
    private int promotionId; // Added to store the numeric ID from the data

    // Transient field to store when a user saved this promotion
    // This field is not stored in the database, but can be populated
    // for API responses
    @Transient
    private LocalDateTime savedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public LocalDateTime getSavedAt() {
        return savedAt;
    }

    public void setSavedAt(LocalDateTime savedAt) {
        this.savedAt = savedAt;
    }

    @Override
    public String toString() {
        return "Promotion [id=" + id + ", merchant=" + merchant + ", description=" + description + ", expiry="
                + expiry + ", imageUrl=" + imageUrl + ", location=" + location + ", code=" + code + ", conditions="
                + conditions + ", category=" + category + ", promotionId=" + promotionId + "]";
    }
}