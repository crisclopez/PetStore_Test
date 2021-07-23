<<<<<<< HEAD
package co.com.petstore.testing.models;

import co.com.petstore.testing.models.builder.TagsInfoBuilder;

public class TagsInfo {

    String id;
    String name;

    public TagsInfo(TagsInfoBuilder tagsInfoBuilder) {
        this.id = tagsInfoBuilder.getTagId();
        this.name = tagsInfoBuilder.getTagName();
    }
}
=======
package co.com.petstore.testing.models;

import co.com.petstore.testing.models.builder.TagsInfoBuilder;

public class TagsInfo {

    String id;
    String name;

    public TagsInfo(TagsInfoBuilder tagsInfoBuilder) {
        this.id = tagsInfoBuilder.getTagId();
        this.name = tagsInfoBuilder.getTagName();
    }
}
>>>>>>> f85c921951b1614f39b2d90e8e4f36b4b60a6115
