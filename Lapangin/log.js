const forms = document.querySelector(".forms"),
    pwShowHide = document.querySelectorAll(".eye-icon"),
    links = document.querySelectorAll(".link");

pwShowHide.forEach(eyeIcon => {
    eyeIcon.addEventListener("click", () => {
        let pwFields = eyeIcon.parentElement.parentElement.querySelectorAll(".password");
        
        pwFields.forEach(password => {
            if(password.type === "password"){
                password.type = "text";
                eyeIcon.classList.replace("bx-hide", "bx-show");
                return;
            }
            password.type = "password";
            eyeIcon.classList.replace("bx-show", "bx-hide");
        })
        
    })
})      

links.forEach(link => {
    link.addEventListener("click", e => {
    e.preventDefault();
    forms.classList.toggle("show-signup");
    })
})

// Ambil elemen form
const signupForm = document.getElementById('signup-form');

signupForm.addEventListener('submit', function (e) {
    e.preventDefault(); // Mencegah reload halaman

    const username = signupForm.username.value;
    const email = signupForm.email.value;
    const phone = signupForm.phone.value;
    const password = signupForm.password.value;
    const confirmPassword = signupForm.confirm_password.value;

    // Validasi password
    if (password !== confirmPassword) {
        alert('Password dan konfirmasi password tidak cocok!');
        return;
    }

    // Simpan data ke database (contoh hanya konsol log untuk ilustrasi)
    console.log({
        username: username,
        email: email,
        phone: phone,
        password: password, // Jangan simpan password dalam format teks biasa di database
    });

    alert('Registrasi berhasil!');
});