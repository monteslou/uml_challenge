# ENDAVA  CHALLENGE

**Endava Internship UML/Java challenge**

## CONTEXT

To practice UML and Java Fundamentals knowledge a challange was given. This challenge splits in 3 exercises as follows:

1. Given the following class diagram, implement the domain-model in a new java project

![](https://raw.githubusercontent.com/monteslou/uml_challenge/dev/domain_model/domain-model.jpg)

- Customer and Product are beans, please implement getters and setters as needed.
- Give a concrete implementation to Order.setTotal() method (Hint: you can use a main() method to test it).
- You do not need to provide concrete implementation to other methods, just a dummy one is right enough (everything must compile).

2. In a separate package, implement the following class diagram.

![](https://raw.githubusercontent.com/monteslou/uml_challenge/dev/pattern.png)

- It is not necessary to give concrete implementation of methods, just dummy ones are enough (everything must compile).
- **What is this design pattern useful for?**

3. Create a class diagram given the following case of study:

> _The goal is to design a school course domain model. So a Course has no more than 30 Students, where one of the Students is the “headman” of the Course. The whole course learns the same subjects except for “foreign language” subject (some of the students learn English and other French). A Teacher can teach from one to many subjects, but he just has one Course assigned. The Student can be evaluated by subject, so he will get a partial grade every 4 months, and a final grade at the end of the school year._

## CONTENT

- **domain_model:** in this folder you can find exercise 1, with notes and the code in java.
- DOMAINMODEL.md: Here you find the notes for the exercise No.1
- **pattern:** in this folder you can find exercise 2, with notes and the code in java, and some additional information about the exercise.
- PATTERN.md: Here you find the notes for the exercise No.2
- **class_diagram:** in this folder you can find exercise 3, with notes and UML diagram, and some additional information about the exercise.

## GIT REPO USE STRATEGY

This repository has followed a standard pattern of use. The main branch is called Master, and contains only the code which has been verified and tested. 
From the Master branch, derives the dev branch. It contains the work that has been done independently, and tested locally. 
This branch has the main purpose of merging the partially-working files from the independent branches, and testing whole-system functionality.
Finally, on the lowest level of branching hierarchy, comes the independent branches. They contain single-developer-feature work. This work may or may not run correctly.

The MIT License
    Copyright (c) 2018 Lourdes Montes

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.

