[![CircleCI](https://circleci.com/gh/spring-framework-guru/sfg-blog-posts.svg?style=svg)](https://github.com/minto5z)
# Spring boot bean validation

This repository contains source code examples from various blog posts from 

#Common Bean Validation Annotations
#Swagger Configuration
#Pagination with Pageable
In addition to the validation annotations we used in the application, some other key JSR 303 (Bean Validation) are:

**@AssertFalse** states that the value of the field or property must be false.<br/>
**@AssertTrue** states that the value of the field or property must be true.<br/>
**@Maxensures** a number whose value must be lower or equal to the specified maximum.<br/>
**@Min** ensures a number whose value must be higher or equal to the specified minimum.<br/>
**@Future** ensurest that the date or time is in the future.<br/>
**@Past** ensures that the date is in the past.<br/>
**@DecimalMax** a decimal number whose value must be lower or equal to the specified maximum.<br/>
**@DecimalMin** a decimal number whose value must be higher or equal to the specified minimum.<br/>

The preceding JPA entity uses several validation constraints in form of annotations on the fields of the entity. Each annotation has a message attribute that specifies the constraint violation message. The annotations used in the code are:

**@NotNull**: Indicates that the annotated blofTitle field should not be null.<br/>
**@Size**: Indicates that blogTitle should have a minimum of two characters. The @Size annotation can also be used to set the minimum and maximum size of arrays, collections such as lists, sets, and maps.<br/>
**@NotBlank** : Validates that the property is not null or whitespace. But, it can be applied only to text values.<br/>
**@Email**: Validates that the annotated property is a valid email address.<br/>
