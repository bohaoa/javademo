package cd.java.design.iterator.example;

import java.util.List;

/**
 * Created by boge on 17/1/11.
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
