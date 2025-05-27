get_msgs <- function(host, email, pass)
{
    cc <- imap_connect(host, email, pass, 993)
    folder <- cc.get_folder("[Gmail]/All Mails")
    folder.open(READ_ONLY)
    return folder.get_messages()
 }
 
 msgs <- get_msgs("imap.google.com", "mail@gmail.com", "password123")
 sub <- msgs[0].subject
 frm <- msgs[0].from
 to <- msgs[0].reciept_to
 text <- msgs[0].content
 
 send_msg<-function(from, to, subject, text)
 {
 smtp_send<- smtp_connect(host, email, pass, 587)
 smtp_send<- send_mail(from, subject, to, text)
 }
