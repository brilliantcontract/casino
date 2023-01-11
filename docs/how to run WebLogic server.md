# How to run WebLogic server

Use VirtualBox image, name is __"contract-roulette-weblogic-server"__.

Run the VirtualBox "contract-roulette-weblogic-server" images.

Casino application could be accessed at http://<VIRTUAL-MACHINE-IP>:7001/casino



## Find IP address of virtual machine

Open virtual machine. It has only command line, graphical interface is not available.

Use credentials to login:

- username: `bob`
- password: `BobSecret!`

When you logged in, use command `ip addr` to find IP address of the virtual machine.

Type `exit` to end user session.



## Install/deploy new application or update to new version

Open web "https://<VIRTUAL-MACHINE-IP>:7001/console" page in web browser.

Use following credentials:

- username: `weblogic`
- password: `WeblogicSecret!`

At left section __Domain Structure__ click on link __Deployments__.

On loaded page, click on __Install__ button.

On loaded page, click on __Upload your file(s)__ link.

On loaded page, click on __Browser...__ button in __Upload a deployment to the Administration Server__ section.

Select file __casino-ear-1.0.ear__ for uploading and installing.

Click __Next__ button (button located at page bottom).

On loaded page, click on __Next__ button (button located at page bottom).

On loaded page, click on __Next__ button (button located at page bottom).

On loaded page, click on __Finish__ button (button located at page bottom).

Well done.