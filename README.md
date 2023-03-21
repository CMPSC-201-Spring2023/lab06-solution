# :crocodile: Scoping

## DUE: March 28th by 2:30pm

[![Actions Status](../../workflows/build/badge.svg)](../../actions)

## Table of Contents

- [Summary](#summary)

- [Objectives](#objectives)

- [Tasks](#tasks)

- [GatorGrade](#gatorgrade)

- [Evaluation](#evaluation)

## Summary

This assignment invites individuals to experiment with scoping. 

You are responsible for documenting the output for this assignment in a report document, stored in the file `writing/report.md`. This is a Markdown file that must adhere to the standards described in the [Markdown Syntax Guide](https://guides.github.com/features/mastering-markdown/). Remember, you can preview the contents of a committed Markdown file by clicking on the name of the file in your GitHub repository.

### Objectives

- To understand the scope rules and storage management.
- To experiment, visualize and study the stack structure in JavaScript and in Java.

## Tasks

For this laboratory assignment, you will complete a set of small experiments to gain a deeper understanding into scoping and storage management. Please navigate to the "writing/report.md" document to find outline of specific experiments and the tasks you are invited to engage in.

## Running and Testing

### Docker Instructions

In this course we will use Docker for an environment where we can compile and execute programs. This provides an environment with the languages that will be used in the class and ensures that everyone uses the same versions for help and grading purposes. 

You should already have the [progator Docker Image](https://hub.docker.com/repository/docker/janyljumadinova/progator). If not, you can download automated build from public Docker Hub Registry:

`docker pull janyljumadinova/progator`

Once you have the Docker image, you can mount a directory as a volume with the argument *-v /your-path/:/root/ like this :

`docker run -d -p 80:80 -v /your-path/:/root/environment janyljumadinova/progator`

#### Accessing the IDE

<http://localhost>

### Running the Java locally

If you have Java installed locally, you can also run Java and Javascript locally from the `src` directory.

## GatorGrade

You can check the baseline writing and repository requirements of this project by running department's assignment checking `gatorgrade` tool To use `gatorgrade`, you first need to make sure you have Python installed. If not, please see:

- [Setting Up Python on Windows](https://realpython.com/lessons/python-windows-setup/)
- [Python 3 Installation and Setup Guide](https://realpython.com/installing-python/)
- [How to Install Python 3 and Set Up a Local Programming Environment on Windows 10](https://www.digitalocean.com/community/tutorials/how-to-install-python-3-and-set-up-a-local-programming-environment-on-windows-10)

Then, you need to install `gatorgrade`:

- First, [install `pipx`](https://pypa.github.io/pipx/installation/)
- Then, install `gatorgrade` with `pipx install gatorgrade`

Finally, you can run `gatorgrade`:

`gatorgrade --config config/gatorgrade.yml`

## Evaluation

The grade that a student receives on this assignment will have the following components. In addition to these three main components, student's grade may be affected by their adherence or the lack of adherence to the Code of Conduct.

*Percentage of Correct GatorGrader Checks and GitHub Actions CI Build Status [up to 15%]*: Students are encouraged to repeatedly revise their submission to ensure that it passes all of GatorGrader's checks and receives a CI pass.

*Mastery of Technical Knowledge and Skills [up to 20%]*: Students will also receive a portion of their assignment grade when their program source files reveal that they have mastered all of the technical knowledge and skills developed during the completion of this lab. Since this lab assignment does not require significant implementation, this portion of the grade is not heavily weighted.

*Mastery of Technical Writing [up to 65%]*: Students will  receive a largest portion of this lab grade when the responses to the technical writing questions presented in the "writing/report.md" reveal a mastery of both writing skills and conceptual and technical knowledge. To receive this portion of the grade, the submitted writing should provide conceptually and technically accurate answers and have correct spelling, grammar, and punctuation in addition to following the rules of Markdown.

## Assistance

If you are having trouble completing any part of this project, then please talk with the course instructor or technical leaders during the laboratory session. Alternatively, you may ask questions in the Discord channel for this course. Finally, you can schedule a meeting during the course instructor's office hours.
