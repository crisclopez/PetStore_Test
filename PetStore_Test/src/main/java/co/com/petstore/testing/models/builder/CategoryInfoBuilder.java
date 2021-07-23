<<<<<<< HEAD
package co.com.petstore.testing.models.builder;

import co.com.petstore.testing.models.CategoryInfo;

public class CategoryInfoBuilder {

    String categoryId;
    String categoryName;

    public CategoryInfoBuilder withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public CategoryInfoBuilder andCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public CategoryInfo build() {
        return new CategoryInfo(this);
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
=======
package co.com.petstore.testing.models.builder;

import co.com.petstore.testing.models.CategoryInfo;

public class CategoryInfoBuilder {

    String categoryId;
    String categoryName;

    public CategoryInfoBuilder withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public CategoryInfoBuilder andCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public CategoryInfo build() {
        return new CategoryInfo(this);
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
