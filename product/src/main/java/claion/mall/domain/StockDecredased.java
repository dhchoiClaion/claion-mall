package claion.mall.domain;

import claion.mall.domain.*;
import claion.mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class StockDecredased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImage;
    private String stock;

    public StockDecredased(Inventory aggregate) {
        super(aggregate);
    }

    public StockDecredased() {
        super();
    }
}
