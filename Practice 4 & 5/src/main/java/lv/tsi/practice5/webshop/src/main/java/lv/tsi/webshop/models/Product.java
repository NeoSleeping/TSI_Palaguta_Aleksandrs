package lv.tsi.webshop.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @JsonProperty
    private float price;
    @JsonProperty
    private String name;
    @JsonProperty
    private String description;
    @JsonProperty
    private String pictureURL;
    @JsonProperty
    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;
}
