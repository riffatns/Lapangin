document.addEventListener("DOMContentLoaded", () => {
    const searchInput = document.querySelector('input[placeholder="Cari nama venue"]');
    const kotaSelect = document.querySelector('select:nth-of-type(1)');
    const olahragaSelect = document.querySelector('select:nth-of-type(2)');
    const venues = document.querySelectorAll('.pro');

    function filterVenues() {
        const searchText = searchInput.value.toLowerCase();
        const selectedKota = kotaSelect.value.toLowerCase();
        const selectedOlahraga = olahragaSelect.value.toLowerCase();

        venues.forEach(venue => {
            const nama = venue.dataset.nama.toLowerCase();
            const kota = venue.dataset.kota.toLowerCase();
            const olahraga = venue.dataset.olahraga.toLowerCase();

            if (
                (nama.includes(searchText) || searchText === "") &&
                (kota === selectedKota || selectedKota === "pilih kota") &&
                (olahraga === selectedOlahraga || selectedOlahraga === "pilih cabang olahraga")
            ) {
                venue.style.display = "block"; // Pastikan elemen terlihat
            } else {
                venue.style.display = "none"; // Sembunyikan elemen jika tidak cocok
            }
        });
    }

    searchInput.addEventListener("input", filterVenues);
    kotaSelect.addEventListener("change", filterVenues);
    olahragaSelect.addEventListener("change", filterVenues);
});