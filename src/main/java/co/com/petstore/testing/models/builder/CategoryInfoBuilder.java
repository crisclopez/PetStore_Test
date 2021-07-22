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
