$(document).ready(function () {
  $("#send-button").click(async function () {
    var question = $("#input-question").val();

    var response = $.ajax({
      method: "POST",
      url: "http://localhost:8080/ask",
      data: {
        question,
      },
    }).done(function () {
      addMessage(question, "sent");
    });

    console.log(`TCL ~ [script.js] ~ line ~ 14 ~ response`, response);

    // Simulate server response (replace with actual server communication)
    // var serverResponse = "This is the answer to your question.";
    // setTimeout(function () {
    //   addMessage(serverResponse, "received");
    // }, 500);
  });
});

function addMessage(text, className) {
  var messageContainer = $("<div>").addClass("message").addClass(className);
  var message = $("<p>").text(text);
  messageContainer.append(message);
  $("#chat-body").append(messageContainer);
}

function EnterKeyEvent() {}
