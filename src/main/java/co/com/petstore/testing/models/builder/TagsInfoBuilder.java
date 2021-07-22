package co.com.petstore.testing.models.builder;

import co.com.petstore.testing.models.TagsInfo;

public class TagsInfoBuilder {

    String tagId;
    String tagName;

    public TagsInfoBuilder withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    public TagsInfoBuilder andTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public TagsInfo build() {
        return new TagsInfo(this);
    }

    public String getTagId() {
        return tagId;
    }

    public String getTagName() {
        return tagName;
    }
}
