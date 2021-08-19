package org.springframework.minto.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.minto.model.Blog;
import org.springframework.minto.repository.BlogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("api/v1")
@Api(tags = "Blog Data")

public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("/blogs")
    @ApiOperation(value = "get blog", response = Blog.class)
    public List<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable).toList();
    }



    @PostMapping("/blog")
    @ApiOperation(value = "post blog", response = Blog.class)
    @ResponseStatus(HttpStatus.CREATED)
   public Blog saveBlog(@Valid @RequestBody Blog savedBlog) {
        return blogRepository.save(savedBlog);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(error ->
                errors.put(error.getField(), error.getDefaultMessage()));

        return errors;
    }
}
