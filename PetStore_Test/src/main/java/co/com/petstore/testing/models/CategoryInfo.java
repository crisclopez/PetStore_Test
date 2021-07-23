<<<<<<< HEAD
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
=======
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
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
