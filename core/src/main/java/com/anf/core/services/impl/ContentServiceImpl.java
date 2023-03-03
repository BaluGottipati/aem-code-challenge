package com.anf.core.services.impl;

import com.anf.core.services.ContentService;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true, service = ContentService.class)
public class ContentServiceImpl implements ContentService {

    @Override
    public void commitUserDetails() {
        // Add your logic. Modify method signature as per need.
    }
}
