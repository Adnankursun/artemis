# artemis
.
# cisco-task
In that repository, the terraform code resulta in an AWS ELB in front of an EC2 instance running Ubuntu Linux.
The infrastructure code sets up the environment, and configure an nginx web server,
with a static home page that says, “Cisco SPL”.

To be able use that code for different environments, you need to change the tfvars file and customize it.

after clone the repository, run the following command
 cd cisco-task
 terraform init
 terraform apply -var-file task.tfvars

 Requirements
 terraform 0.11.14
