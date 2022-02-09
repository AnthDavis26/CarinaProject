/*
 * Copyright 2013-2021 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.solvd.carinaproject;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.solvd.carinaproject.api.*;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

/**
 * This sample shows how create REST API tests.
 *
 * @author qpsdemo
 */
public class APISampleTest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "qpsdemo")
    public void testCreateUser() throws Exception {
        LOGGER.info("test");
        setCases("4555,54545");
        PostUserMethod api = new PostUserMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "qpsdemo")
    public void testCreateUserMissingSomeFields() throws Exception {
        PostUserMethod api = new PostUserMethod();
        api.getProperties().remove("name");
        api.getProperties().remove("username");
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "qpsdemo")
    public void testGetUsers() {
        GetUserMethods getUsersMethods = new GetUserMethods();
        getUsersMethods.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUsersMethods.callAPI();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("api/users/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestPriority(Priority.P1)
    public void testDeleteUsers() {
        DeleteUserMethod deleteUserMethod = new DeleteUserMethod();
        deleteUserMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteUserMethod.callAPI();
        deleteUserMethod.validateResponse();
    }

    @Test()
    public void testCreateTodo() throws Exception {
        LOGGER.info("test");
        setCases("4555,54545");
        PostTodoMethod api = new PostTodoMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test()
    public void testGetTodos() {
        GetTodoMethod getTodoMethod = new GetTodoMethod();
        getTodoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getTodoMethod.callAPI();
        getTodoMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getTodoMethod.validateResponseAgainstSchema("api/todos/_get/rs.schema");
    }

    @Test()
    @TestPriority(Priority.P1)
    public void testDeleteTodos() {
        DeleteTodoMethod deleteTodoMethod = new DeleteTodoMethod();
        deleteTodoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteTodoMethod.callAPI();
        deleteTodoMethod.validateResponse();
    }

    @Test()
    public void testCreatePost() throws Exception {
        LOGGER.info("test");
        setCases("4555,54545");
        PostPostMethod api = new PostPostMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test()
    public void testGetPosts() {
        GetPostMethod getPostMethod = new GetPostMethod();
        getPostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getPostMethod.callAPI();
        getPostMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPostMethod.validateResponseAgainstSchema("api/posts/_get/rs.schema");
    }

    @Test()
    @TestPriority(Priority.P1)
    public void testDeletePosts() {
        DeletePostMethod deletePostMethod = new DeletePostMethod();
        deletePostMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deletePostMethod.callAPI();
        deletePostMethod.validateResponse();
    }

    @Test()
    public void testCreatePhoto() throws Exception {
        LOGGER.info("test");
        setCases("4555,54545");
        PostPhotoMethod api = new PostPhotoMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test()
    public void testGetPhotos() {
        GetPhotoMethod getPhotoMethod = new GetPhotoMethod();
        getPhotoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getPhotoMethod.callAPI();
        getPhotoMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPhotoMethod.validateResponseAgainstSchema("api/photos/_get/rs.schema");
    }

    @Test()
    @TestPriority(Priority.P1)
    public void testDeletePhotos() {
        DeletePhotoMethod deletePhotoMethod = new DeletePhotoMethod();
        deletePhotoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deletePhotoMethod.callAPI();
        deletePhotoMethod.validateResponse();
    }

    @Test()
    public void testCreateAlbum() throws Exception {
        LOGGER.info("test");
        setCases("4555,54545");
        PostAlbumMethod api = new PostAlbumMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test()
    public void testGetAlbums() {
        GetAlbumMethod getAlbumMethod = new GetAlbumMethod();
        getAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAlbumMethod.callAPI();
        getAlbumMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getAlbumMethod.validateResponseAgainstSchema("api/albums/_get/rs.schema");
    }

    @Test()
    @TestPriority(Priority.P1)
    public void testDeleteAlbums() {
        DeleteAlbumMethod deleteAlbumMethod = new DeleteAlbumMethod();
        deleteAlbumMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteAlbumMethod.callAPI();
        deleteAlbumMethod.validateResponse();
    }

    @Test()
    public void testCreateComment() throws Exception {
        LOGGER.info("test");
        setCases("4555,54545");
        PostCommentMethod api = new PostCommentMethod();
        api.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        api.callAPI();
        api.validateResponse();
    }

    @Test()
    public void testGetComments() {
        GetCommentMethod getCommentMethod = new GetCommentMethod();
        getCommentMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getCommentMethod.callAPI();
        getCommentMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getCommentMethod.validateResponseAgainstSchema("api/comments/_get/rs.schema");
    }

    @Test()
    @TestPriority(Priority.P1)
    public void testDeleteComments() {
        DeleteCommentMethod deleteCommentMethod = new DeleteCommentMethod();
        deleteCommentMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteCommentMethod.callAPI();
        deleteCommentMethod.validateResponse();
    }
}
