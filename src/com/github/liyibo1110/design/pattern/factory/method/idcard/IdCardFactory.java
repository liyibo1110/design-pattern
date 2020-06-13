package com.github.liyibo1110.design.pattern.factory.method.idcard;

import com.github.liyibo1110.design.pattern.factory.method.framework.Factory;
import com.github.liyibo1110.design.pattern.factory.method.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IdCard)product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
