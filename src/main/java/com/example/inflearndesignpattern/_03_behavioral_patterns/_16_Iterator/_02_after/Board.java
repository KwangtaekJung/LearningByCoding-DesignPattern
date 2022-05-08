package com.example.inflearndesignpattern._03_behavioral_patterns._16_Iterator._02_after;

import com.example.inflearndesignpattern._03_behavioral_patterns._16_Iterator._01_before.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    List<Post> posts = new ArrayList<>();

    // TODO 들어간 순서대로 순회하기 1
//    public List<Post> getPosts() {
//        return posts;
//    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    // TODO 들어간 순서대로 순회하기 2
    public Iterator<Post> getDefaultIterator() {
        return this.posts.iterator();
    }
}
