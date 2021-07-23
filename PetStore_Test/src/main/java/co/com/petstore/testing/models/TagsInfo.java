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
