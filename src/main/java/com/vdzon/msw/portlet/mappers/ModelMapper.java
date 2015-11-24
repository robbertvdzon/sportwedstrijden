package com.vdzon.msw.portlet.mappers;

import java.util.List;

public interface ModelMapper <Model,Entity> {
    Entity mergeModel(final Model model, Entity entity);
    public Model toModel(final Entity entity);
    public List<Model> toModel(final Entity[] entities);
}
