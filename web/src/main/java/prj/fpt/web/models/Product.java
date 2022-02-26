package prj.fpt.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
	private int id;
    private String name;
    private String image;
    private double price;
    private String title;
    private String description;
}
