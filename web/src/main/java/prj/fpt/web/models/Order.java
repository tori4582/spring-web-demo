package prj.fpt.web.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
	private int oid;
    private Product product;
    private int amount;
    private int orderStatus;
}
