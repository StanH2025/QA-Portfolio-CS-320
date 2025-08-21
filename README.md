# QA Portfolio

This repository showcases my work from Project One and Project Two in this course. Together, these projects highlight the skills I have been building in software testing, automation, and quality assurance. They also show my ability to create and apply unit tests, analyze testing approaches, and design software that meets both functional and quality requirements.  

## Files Included
- **Project One**:  
  - `Contact.java`  
  - `ContactService.java`  
  - `ContactTest.java`  
  - `ContactServiceTest.java`  

- **Project Two**:  
  - `ProjectTwo_Summary_Reflections.pdf`  

---

## Reflection

### How can I ensure that my code, program, or software is functional and secure?  
In my Contact Service project, I worked on making sure that the code was functional by validating user inputs, enforcing unique identifiers, and confirming that update and delete operations worked as intended. To keep things secure, I focused on practices like strict input validation and limiting unnecessary exposure of data. I also used unit tests to check for errors and make sure changes didn’t break existing functionality. Running these tests consistently gives me confidence that the software behaves the way it should and helps prevent regressions over time.  

### How do I interpret user needs and incorporate them into a program?  
For me, user needs become meaningful when they can be tied directly to testable requirements. In the Contact Service project, the requirements for creating, updating, and deleting contacts guided the tests I wrote. Each test confirmed whether those needs were being met. I also try to think about the user experience: is the data consistent, are errors handled clearly, and does the program behave in a predictable way? By starting with user goals and then building tests around them, I make sure that what I’m coding lines up with what the user actually needs.  

### How do I approach designing software?  
When I design software, I start simple and build outward. I like to define the responsibilities of each class first and then write unit tests to lock in that expected behavior. In the Contact Service project, I kept `Contact` focused on representing valid contact data, while `ContactService` handled managing that data with rules like uniqueness and proper validation. I worked iteratively: I wrote a test, built the simplest solution to make it pass, and then refactored once I knew the logic was solid. This approach keeps the design clean, easy to maintain, and directly aligned with the requirements.  

---

## Purpose
This portfolio entry is here not just as a record of my work but also as a reflection of how my understanding has grown. These projects show how I can use unit testing and automation to build reliable software and how I can approach design in a way that is both thoughtful and practical. I plan to use this portfolio to look back on my progress and to show future opportunities what I am capable of.  
