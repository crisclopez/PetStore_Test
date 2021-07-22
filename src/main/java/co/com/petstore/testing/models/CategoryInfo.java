package co.com.petstore.testing.models;

import co.com.petstore.testing.models.builder.CategoryInfoBuilder;

public class CategoryInfo {

    String id;
    String name;

    public CategoryInfo(CategoryInfoBuilder categoryInfoBuilder) {
        this.id = categoryInfoBuilder.getCategoryId();
        this.name = categoryInfoBuilder.getCategoryName();
    }
}
